package com.fullcycle.admin.catalogo.application;

import com.fullcycle.admin.catalogo.domain.category.Category;

public class UseCase {

    public Category execute() {
		final var expectedName = "Filmes";
		final var expectedDescription = "A categoria mais assistida";
		final var expectedIsActive = true;
        return Category.newCategory(expectedName, expectedDescription, expectedIsActive);
    }
}