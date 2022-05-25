package edu.unlam.diit.pa.AventurerosMateros;

import java.util.ArrayList;
import java.util.List;

public class MainMateros {
	public static void main(String[] args) {
        int n = 5, mate = 0;
        int a[]={1,2,3,4};
        List materos = new ArrayList();
        List salen = new ArrayList();
        for (int i=1; i<=n; i++) {
            materos.add(i);
        }
        for (int i : a) {
            mate = ( mate + ( i % materos.size() ) ) % materos.size();
            salen.add( materos.get(mate) );
            materos.remove(mate);
        }
        System.out.println(salen);
        System.out.println(materos);
    }
}
