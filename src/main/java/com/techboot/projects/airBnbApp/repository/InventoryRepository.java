package com.techboot.projects.airBnbApp.repository;

import com.techboot.projects.airBnbApp.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
