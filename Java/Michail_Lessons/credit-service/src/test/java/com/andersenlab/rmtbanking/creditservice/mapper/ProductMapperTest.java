package com.andersenlab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.ProductDto;
import com.lab.rmtbanking.creditservice.entity.Product;
import com.andersenlab.rmtbanking.creditservice.util.DtoCreator;
import com.andersenlab.rmtbanking.creditservice.util.EntityCreator;
import com.lab.rmtbanking.creditservice.mapper.ProductMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test class for ProductMapper")
class ProductMapperTest {

    private final ProductMapper productMapper = new ProductMapperImpl();

    @Test
    @DisplayName("When we have correct entity then return correct ProductDto")
    void fromEntityToDto() {
        Product product = EntityCreator.getProduct();
        ProductDto productDto = productMapper.toDto(product);
        compareEntityWithDto(product, productDto);
    }

    @Test
    @DisplayName("When we have correct ProductDto then return correct entity")
    void fromDtoToEntity() {
        ProductDto productDto = DtoCreator.getProductDto();
        Product product = productMapper.toEntity(productDto);
        compareEntityWithDto(product, productDto);
    }

    @Test
    @DisplayName("When we have correct list of Products then return correct list of ProductDto")
    void fromListToListDto() {
        List<Product> productList = new ArrayList<>();
        productList.add(EntityCreator.getProduct());
        List<ProductDto> productDtoList = productMapper.productsToProductsDto(productList);
        compareProductListWithListDto(productList, productDtoList);
    }

    private void compareEntityWithDto(Product product, ProductDto dto) {
        assertAll(
                () -> assertEquals(product.getId(), dto.getId()),
                () -> assertEquals(product.getName(), dto.getName()),
                () -> assertEquals(product.getMinSum(), dto.getMinSum()),
                () -> assertEquals(product.getMaxSum(), dto.getMaxSum()),
                () -> assertEquals(product.getCurrencyCode(), dto.getCurrencyCode()),
                () -> assertEquals(product.getMinInterestRate(), dto.getMinInterestRate()),
                () -> assertEquals(product.getMaxInterestRate(), dto.getMaxInterestRate()),
                () -> assertEquals(product.isNeedGuarantees(), dto.isNeedGuarantees()),
                () -> assertEquals(product.isDeliveryInCash(), dto.isDeliveryInCash()),
                () -> assertEquals(product.isEarlyRepayment(), dto.isEarlyRepayment()),
                () -> assertEquals(product.isNeedGuarantees(), dto.isNeedGuarantees()),
                () -> assertEquals(product.isNeedIncomeDetails(), dto.isNeedIncomeDetails()),
                () -> assertEquals(product.getMinPeriodMonths(), dto.getMinPeriodMonths()),
                () -> assertEquals(product.getMaxPeriodMonths(), dto.getMaxPeriodMonths()),
                () -> assertEquals(product.isActive(), dto.isActive()),
                () -> assertEquals(product.getDetails(), dto.getDetails()),
                () -> assertEquals(product.getCalculationMode(), dto.getCalculationMode()),
                () -> assertEquals(product.getGracePeriodMonths(), dto.getGracePeriodMonths()),
                () -> assertEquals(product.isRateIsAdjustable(), dto.isRateIsAdjustable()),
                () -> assertEquals(product.getRateBase(), dto.getRateBase()),
                () -> assertEquals(product.getRateFixPart(), dto.getRateFixPart()),
                () -> assertEquals(product.getIncreasedRate(), dto.getIncreasedRate()));
    }

    private void compareProductListWithListDto(List<Product> productList, List<ProductDto> productDtoList) {
        assertEquals(productList.size(), productDtoList.size());
        for (int s = 0; s < productList.size(); s++) {
            compareEntityWithDto(productList.get(s), productDtoList.get(s));
        }
    }
}