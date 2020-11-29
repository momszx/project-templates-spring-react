package hu.uni.eku.team3.controller;

import hu.uni.eku.team3.controller.dto.ProductsDto;
import hu.uni.eku.team3.service.ProductsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/Products")
@RequiredArgsConstructor
@Api(tags = "Products")
@Slf4j
public class ProductsController {

    private final ProductsService productsService;

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch products")
    public Collection<ProductsDto> fetchAll() {
        return productsService.readAll().stream().map(product ->
                ProductsDto.builder()
                        .productName(product.getProductName())
                        .productPrice(product.getProductPrice())
                        .id(product.getId())
                        .Adult(product.getAdult())
                        .build()
        ).collect(Collectors.toList());
    }

}

