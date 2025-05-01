public class StackSurat12 {
    Surat12[] tumpukan;
    int top;
    int kapasitas;

    public StackSurat12(int kapasitas) {
        this.kapasitas = kapasitas;
        this.tumpukan = new Surat12[kapasitas];
        this.top = -1;
    }

    public boolean isFull() {
        return top == kapasitas - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat12 surat) {
        if (isFull()) {
            System.out.println("Stack surat penuh!");
        } else {
            tumpukan[++top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        }
    }

    public Surat12 pop() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        } else {
            return tumpukan[top--];
        }
    }

    public Surat12 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return null;
        } else {
            return tumpukan[top];
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                tumpukan[i].tampilkanInfo();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
