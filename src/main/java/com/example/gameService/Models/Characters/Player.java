package com.example.gameService.Models.Characters;

import com.example.gameService.Models.Weapons.Weapon;

import javax.persistence.*;

@Entity
@Table
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int maxHealth;

    @Column
    private int exp = 0;

    @Column
    private int level = 1;

    @ManyToOne
    @JoinColumn(name = "weapon_id")
    private Weapon weapon;

    public Player(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.weapon = weapon;
    }

    private Player() {}

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

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
