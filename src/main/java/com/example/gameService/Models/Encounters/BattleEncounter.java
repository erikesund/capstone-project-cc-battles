package com.example.gameService.Models.Encounters;

import com.example.gameService.Models.Characters.Enemy;

import javax.persistence.*;

@Entity
@Table(name = "battles")
public class BattleEncounter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "enemy_id")
    private Enemy enemy;

    public BattleEncounter(String name, Enemy enemy) {
        this.name = name;
        this.enemy = enemy;
    }

    public BattleEncounter() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
}
