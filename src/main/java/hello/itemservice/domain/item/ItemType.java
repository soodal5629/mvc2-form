package hello.itemservice.domain.item;

import lombok.Getter;

public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    // enum 타입 생성
    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
