package hwan.hwanshopthymeleaf.repository;

import hwan.hwanshopthymeleaf.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
