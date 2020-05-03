package com.codewizard.unittesttutorial.Data;

import com.codewizard.unittesttutorial.Model.Item;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ItemRepository extends JpaRepositoryImplementation<Item,Integer> {
    public static void retrieveAllData() {
    }
}