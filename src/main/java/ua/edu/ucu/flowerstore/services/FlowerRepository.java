package ua.edu.ucu.flowerstore.services;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.edu.ucu.flowerstore.items.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
