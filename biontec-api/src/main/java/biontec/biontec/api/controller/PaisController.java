package biontec.biontec.api.controller;

import biontec.biontec.api.model.PaisModel;
import biontec.biontec.api.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.xml.ws.soap.AddressingFeature;
import java.nio.charset.StandardCharsets;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/paises")
public class PaisController {
    @Autowired
    private PaisRepository repository;
    private String nome_pais;

    @GetMapping(path = "/")
    public ResponseEntity<List<PaisModel>>listarPaises(){
        return ResponseEntity.ok(repository.findAll());
    }


        @GetMapping(path = "/{id_paises}")
        public ResponseEntity consultarPaisPorId(@PathVariable("id_paises") Integer id_paises){
            return repository.findById(id_paises).map(record -> ResponseEntity.ok().body(record))
                    .orElse(ResponseEntity.notFound().build());
        }

/*
    @GetMapping(path = "/{nome_pais}")
    public ResponseEntity consultarPaisPorNome(@PathVariable("nome_pais") String nome_pais){
        return repository.findByNome_pais(nome_pais);
    }


    @GET
    @Path( "/{nome_pais}")
        public Response consultarPaisPorNome(@PathParam("nome_pais") String nome_pais) {
         return Response.ok(repository).entity(nome_pais).build();
          //  return Response.status(200).entity(nome_pais).build();


    }




@GetMapping(path = "/{nome_pais}")
public Response consultarPaisPorNome(@PathVariable("nome_pais") String nome_pais) {
   // return Response.ok((nome_pais).toString()).build();
   // return ResponseEntity.ok(nome_pais);


          https://mkyong.com/webservices/jax-rs/jax-rs-queryparam-example/

          https://stackoverflow.com/questions/11552248/when-to-use-queryparam-vs-pathparam

                     */


}


