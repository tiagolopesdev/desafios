/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIO.OrdenaçãoFiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author tiago
 */
public class Uniformes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer n = Integer.parseInt(st.nextToken());

        List<Tshirt> t = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String next = br.readLine();
            if (next.equals("0")) {
                break;
            }
            Tshirt tshirt = new Tshirt();
            tshirt.setOwner(next);
            String[] twoIn = br.readLine().split(" ");
            tshirt.setColor(twoIn[0]);
            tshirt.setSize(twoIn[1]);
            t.add(tshirt);
        }

        Comparator<Tshirt> comparator = Comparator
                .comparing(Tshirt::getColor).reversed()
                .thenComparing(Tshirt::getSize).reversed()
                .thenComparing(Tshirt::getOwner);
        t.stream().sorted(comparator).forEach(System.out::println);
    }

    public static class Tshirt {

        private String size;
        private String color;
        private String owner;

        public Tshirt(String size, String color, String owner) {
            this.size = size;
            this.color = color;
            this.owner = owner;
        }

        public Tshirt() {
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        @Override
        public String toString() {
            return this.getColor() + " " + this.getSize() + " " + this.getOwner();
        }
    }
}
