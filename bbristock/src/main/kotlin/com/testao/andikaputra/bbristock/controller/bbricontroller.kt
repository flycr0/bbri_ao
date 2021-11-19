package com.testao.andikaputra.bbristock.controller
import com.testao.andikaputra.bbristock.repo.bbrirepo
import com.testao.andikaputra.bbristock.model.bbrimodel
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/data/bbri/")

class bbricontroller(private val bbrirepo: bbrirepo){

  @GetMapping("/bbribid")


    @PostMapping("/bbribid") 
    fun CreateBidPrice(@RequestBody bbribid: bbrimodel): bbrimodel =
    bbrirepo.save(bbribid)

    @GetMapping("/bbribid/{id}") 
    fun GetBidById(@PathVariable(value = "id") id: String): ResponseEntity<bbrimodel> {
        return bbrirepo.findById(id).map { bbribid ->
            ResponseEntity.ok(bbribid)
        }.orElse(ResponseEntity.notFound().build())
    }

    @GetMapping("/bbrioffer")

    @PostMapping("/bbrioffer") 
    fun CreateOfferPrice(@RequestBody bbrioffer: bbrimodel): bbrimodel =
    bbrirepo.save(bbrioffer)

    @GetMapping("/bbrioffer/{id}") 
    fun GetOfferById(@PathVariable(value = "id") id: String): ResponseEntity<bbrimodel> {
        return bbrirepo.findById(id).map { bbrioffer ->
            ResponseEntity.ok(bbrioffer)
        }.orElse(ResponseEntity.notFound().build())
    }
}