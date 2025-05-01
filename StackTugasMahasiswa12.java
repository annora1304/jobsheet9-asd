public class StackTugasMahasiswa12 {
    Mahasiswa12[] stack;
    int top;
    int size;

    public StackTugasMahasiswa12(int size) {
        this.size = size;
        stack = new Mahasiswa12[size];
        top = -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(Mahasiswa12 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public Mahasiswa12 pop() {
        if (!isEmpty()) {
            Mahasiswa12 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang bisa diambil.");
            return null;
        }
    }
    public Mahasiswa12 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang bisa dilihat.");
            return null;
        }
    }
    public Mahasiswa12 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
    public int jumlahTugas() {
        return top + 1;
    }    
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println("Nama: " + stack[i].nama + ", NIM: " + stack[i].nim + ", Kelas: " + stack[i].kelas + ", Nilai: " + stack[i].nilai);
        }
        System.out.println("");
    }
    public String KonversiDesimalKeBiner(int nilai) {
        StackKonversi12 stack = new StackKonversi12();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
    public void printBiner(int nilai) {
        String biner = KonversiDesimalKeBiner(nilai);
        System.out.println("Nilai dalam biner: " + biner);
    }
}
