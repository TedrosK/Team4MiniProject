package org.example;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SnackRepository {
    private List<Snacks> snacks;

        public SnackRepository(){
            snacks = new ArrayList<>();
            snacks.add(new Snacks("Djungelvrål", 15.99));
            snacks.add(new Snacks("Popcorn", 29.99));
            snacks.add(new Snacks("Chips", 19.99));
        }

        public List<Snacks> getSnacks() {
            return snacks;
        }
    }
