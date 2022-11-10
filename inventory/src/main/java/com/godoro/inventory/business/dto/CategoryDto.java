package com.godoro.inventory.business.dto;

public class CategoryDto {

	private long categoryId;
    private String categotyName;

    public CategoryDto() {
    }

    public CategoryDto(long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categotyName = categoryName;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categotyName;
    }

    public void setCategoryName(String categotyName) {
        this.categotyName = categotyName;
    }
}
