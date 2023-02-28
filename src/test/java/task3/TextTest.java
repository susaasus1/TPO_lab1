package test.java.task3;

import main.java.task3.act.Skill;
import main.java.task3.being.*;
import main.java.task3.exception.DescException;
import main.java.task3.notalive.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TextTest {
    static Hemuliha hemuliha;
    static Skill skill;
    static Skill skill2;
    static Skill skill3;
    static Skill skill4;
    static Guests guests;
    static Home home;
    static Tea tea;
    static Snusmumrik snusmumrik;
    static Kids kids;
    static Place forest;
    static Poster poster;
    static Place park;


    @BeforeAll
    public static void init() {
        hemuliha = new Hemuliha();
        skill = new Skill("угощать ");
        skill2 = new Skill("Любить");
        skill3 = new Skill("Получить");
        skill4 = new Skill("Вручить");
        guests = new Guests();
        kids = new Kids();
        snusmumrik = new Snusmumrik();
        home = new Home();
        tea = new Tea();
        forest = new Forest();
        park = new Park();
        poster = new Poster();
    }

    @Test
    public void testHemuliha() {
        Assertions.assertNull(hemuliha.getDescriptions());
        hemuliha.setDescriptions(Size.LITTLE);
        Assertions.assertEquals(Size.LITTLE, hemuliha.getDescriptions());
        hemuliha.setDescriptions(Size.BIG);
        Assertions.assertEquals(Size.BIG, hemuliha.getDescriptions());

        Assertions.assertEquals(List.of(), hemuliha.getSkills());
        hemuliha.learn(skill);
        Assertions.assertEquals(List.of(skill), hemuliha.getSkills());

        hemuliha.setWhoInteractsWith(guests);
        Assertions.assertEquals(guests.getName(), hemuliha.getWhoInteractsWith().getName());

        hemuliha.setWhere(home);
        Assertions.assertEquals(home.getName(), hemuliha.getWhere().getName());

        hemuliha.setHave(tea);
        Assertions.assertEquals(tea.getName(), hemuliha.getHave().getName());

        Assertions.assertEquals("большая Хемулиха угощать гостей чаем у себя дома",
                hemuliha.getDescriptions().getDescription() + hemuliha.getName() + hemuliha.getSkills().get(0).getName() +
                        hemuliha.getWhoInteractsWith().getName() + hemuliha.getHave().getName() +
                        hemuliha.getWhere().getDescription());

    }

    @Test
    public void checkSkills() {
        Assertions.assertEquals(List.of(), snusmumrik.getSkills());
        Assertions.assertEquals(List.of(), kids.getSkills());
        snusmumrik.learn(skill2);
        snusmumrik.learn(skill3);
        kids.learn(skill4);
        Assertions.assertEquals(List.of(skill4), kids.getSkills());
        Assertions.assertEquals(List.of(skill2, skill3), snusmumrik.getSkills());
        Assertions.assertNotEquals(List.of(skill, skill2, skill4), snusmumrik.getSkills());
    }

    @Test
    public void checkPlaces() throws DescException {
        Assertions.assertThrows(DescException.class, () -> {
            forest.getInfo();
        });

        forest.setDescription("над");
        Assertions.assertDoesNotThrow(() -> {
            forest.getInfo();
        });

        Assertions.assertEquals("над", forest.getInfo());

    }

    @Test
    public void checkPoster() {
        Assertions.assertNull(poster.getWhereSpin());
        forest.setDescription("над");
        poster.setWhereSpin(forest);
        Assertions.assertEquals("продолжали кружиться над лесом.", poster.continued());


        Assertions.assertNull(poster.getWhereCling());
        poster.setWhereCling(park);
        Assertions.assertEquals("спланировала на лесную полянку", poster.planning());



    }

}
