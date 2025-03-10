package Pertemuan4;

// Latihan 1 //
class Node {
 private double data;  
 private Node next; 

 
 public Node(double data) {
     this.data = data;
     this.next = null;
 }

 // Getter untuk mendapatkan nilai data
 public double getData() {
     return data;
 }

 // Setter untuk mengubah nilai data
 public void setData(double data) {
     this.data = data;
 }

 // Getter untuk mendapatkan node berikutnya
 public Node getNext() {
     return next;
 }

 // Setter untuk mengubah node berikutnya
 public void setNext(Node next) {
     this.next = next;
 }

}
