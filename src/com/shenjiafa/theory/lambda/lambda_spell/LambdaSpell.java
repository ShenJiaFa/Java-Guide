package com.shenjiafa.theory.lambda.lambda_spell;

/**
 * Function: Simulate swim match
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class LambdaSpell {

    public static void main(String[] args) {

        swimMatch(() -> System.out.println("The teacher swims very fast..."));

        System.out.println("------------------------------");

        swimMatch(() -> System.out.println("Students swim very slowly..."));

    }

    /**
     * Swim match
     *
     * @param swimmer Swimmer
     */
    private static void swimMatch(Swim swimmer) {
        System.out.println("Competition start!");
        swimmer.swim();
        System.out.println("Competition over!");
    }

}
