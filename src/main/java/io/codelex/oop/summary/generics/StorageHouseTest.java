package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class StorageHouseTest {

    @Test
    public void testStorageHouse() {
        StorageHouse<String> storageHouse = new StorageHouse<>("Chair");
        storageHouse.addMoreItems("Table");
        storageHouse.addMoreItems("Cat");
        Optional<String> firstItem = storageHouse.getMaybeFirstItem();
        Assertions.assertTrue(firstItem.isPresent());
        Assertions.assertEquals("Chair", firstItem.get());
    }
}