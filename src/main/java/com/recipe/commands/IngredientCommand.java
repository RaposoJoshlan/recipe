package com.recipe.commands;

import com.recipe.domain.Recipe;
import com.recipe.domain.UnitOfMeasure;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created on 11/04/2022
 */

@Setter
@Getter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand unitOfMeasure;
    private RecipeCommand recipe;

}
