package com.oguzhano.issuemanagement.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TPage<T> {

    private int number;// su an kacinci sayfa
    private int size;//kayitlari kacarli gosterecegiz
    private Sort sort;//siralama icin 10 arli yada 5 er li
    private int totalPages;//toplamda kac sayfa olustu 10 arlı olustugu zaman toplam 100 sayfa farsa 10 sayfa olusacak gibi
    private Long totalElements;//toplam kac kayit var
    private List<T> content;//donulecek data

    public void setStat(Page page, List<T> list){

        this.number = page.getNumber();
        this.size = page.getSize();
        this.sort = page.getSort();
        this.totalPages = page.getTotalPages();
        this.totalElements = page.getTotalElements();
        this.content = list;
    }
}
