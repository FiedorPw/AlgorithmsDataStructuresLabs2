//import java.util.LinkedList;
//
//public class ListaPacjentów {
//    LinkedList<Pacjent> lista = new LinkedList<Pacjent>();
//
//    public void dodajPacjenta(int time,int Klasa){
//        Pacjent pacjent = new Pacjent(time,Klasa);
//        int i = 0;
//        if(!lista.isEmpty()) {
//            while (lista.size() != i && (lista.get(i).getKlasa() < pacjent.getKlasa())) {
//                i++;
//            }
//            while (lista.size() != i && (lista.get(i).getCzasZgloszenia() < pacjent.getCzasZgloszenia()) && pacjent.getKlasa() == lista.get(i).getKlasa()) {
//                i++;
//            }
//
//
//            lista.add(i, pacjent);
//
//
//        }else lista.add(pacjent);
//
//    }
//
//
//
//
//    public void usuńPierwszegoPacjenta(){
//        lista.removeFirst();
//        System.out.println("usunięto pierwszego pacjenta\n");
//    }
//
//
//    public void printList() {
//        int currentClass = 1;
//        for (int i = 0; i < lista.size(); i++) {
//            if(currentClass != lista.get(i).getKlasa()){
//                currentClass++;
//                System.out.println("");
//            }
//            System.out.println("klasaPacjenta "+lista.get(i).getKlasa()+" czas "+lista.get(i).getCzasZgloszenia());
//
//        }
//        System.out.println("\n" );
//
//    }
//}
