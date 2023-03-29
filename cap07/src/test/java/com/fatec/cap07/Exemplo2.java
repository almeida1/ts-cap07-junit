package com.fatec.cap07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exemplo2 {
    private Collection<Object> collection;
    @BeforeEach
    public void setUp() {
        collection = new ArrayList<Object>();
    }

    @Test
   public void verificaCollectionVazia() {
       assertTrue(collection.isEmpty());
   }
    @Test
   public void verificaCollectionComUmItem() {
       collection.add("itemA");
       assertEquals(1, collection.size());
   }


}
