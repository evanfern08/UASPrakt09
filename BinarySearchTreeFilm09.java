public class BinarySearchTreeFilm09 {
    NodeFilm09 root;

    public BinarySearchTreeFilm09() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Film09 data) {
        NodeFilm09 newNode = new NodeFilm09(data);

        if (isEmpty()) {
            root = newNode;
            return;
        }

        NodeFilm09 current = root;
        NodeFilm09 parent = null;
        
        while (current != null) {
            parent = current;

            if (data.kodeFilm.compareTo(current.data.kodeFilm) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (data.kodeFilm.compareTo(parent.data.kodeFilm) < 0) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }
    public boolean find(String kodeFilm) {
        NodeFilm09 current =  root;
        
        while (current != null) {
            if (kodeFilm.equals(current.data.kodeFilm)) {
                return true;
            }

            if (kodeFilm.compareTo(current.data.kodeFilm) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public void traverseInOrder(NodeFilm09 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(NodeFilm09 node) {
        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    public int hitungJumlahFilm(NodeFilm09 node) {
        if (node == null) {
            return 0;
        }
        return 1 + hitungJumlahFilm(node.left)  
                 + hitungJumlahFilm(node.right);
    }
    public Film09 cariRatingTertinggi(NodeFilm09 node) {
        if (node == null) {
            return null;
        }

        Film09 tertinggi = node.data;

        Film09 kiri = cariRatingTertinggi(node.left);
        Film09 kanan = cariRatingTertinggi(node.right);

        if (kiri != null && kiri.rating > tertinggi.rating) {
            tertinggi = kiri;
        }
        if (kanan != null && kanan.rating > tertinggi.rating) {
            tertinggi = kanan;
        }
        return tertinggi;
    }
}