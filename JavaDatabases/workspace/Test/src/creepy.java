import java.util.*;

public class creepy
{
    static ArrayList<MonsterClass> Monsters = new ArrayList<MonsterClass>();

    public static void main (String[] args)
    {
        Monsters.add(new MonsterClass("Werewolf",100));
        Monsters.add(new MonsterClass("Vampire",150));
        Monsters.add(new MonsterClass("Sasquatch",200));

        System.out.println(Monsters.get(0).Species + "  HP = " + Monsters.get(0).HP);
        Monsters.get(0).Damage();
        System.out.println(Monsters.get(0).Species + "  HP = " + Monsters.get(0).HP);

        Monsters.remove(0);
    }
}

class MonsterClass
{
    public String Species;
    public int HP;

    MonsterClass (String NewSpecies, int NewHP)
    {
        Species = NewSpecies;
        HP = NewHP;
    }

    public void Damage()
    {
        HP = HP - 10;
    }
}