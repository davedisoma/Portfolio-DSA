import java.util.Scanner;

public class Portfolio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a data structure:");
            System.out.println("[1] List");
            System.out.println("[2] Linked List");
            System.out.println("[3] Stack");
            System.out.println("[4] Queue");
            System.out.println("[5] Tree");
            System.out.println("[6] Binary Tree");
            System.out.println("[7] Graph");
            System.out.println("[0] Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected: List");
                    System.out.println("import java.util.ArrayList;\n" +
"import java.util.Scanner;\n" +
"\n" +
"public class FinalPortfolio {\n" +
"    private ArrayList<String> list;\n" +
"\n" +
"    public FinalPortfolio() {\n" +
"        list = new ArrayList<>();\n" +
"    }\n" +
"\n" +
"    // Method to add an element to the list\n" +
"    public void addElement(String element) {\n" +
"        list.add(element);\n" +
"        System.out.println(\"Item added: \" + element);\n" +
"    }\n" +
"\n" +
"    // Method to delete an element from the list\n" +
"    public void deleteElement(String element) {\n" +
"        if (list.contains(element)) {\n" +
"            list.remove(element);\n" +
"            System.out.println(\"Item removed: \" + element);\n" +
"        } else {\n" +
"            System.out.println(\"Item not found: \" + element);\n" +
"        }\n" +
"    }\n" +
"\n" +
"    // Method to print all elements in the list\n" +
"    public void printList() {\n" +
"        if (list.isEmpty()) {\n" +
"            System.out.println(\"The list is empty.\");\n" +
"        } else {\n" +
"            System.out.println(\"Elements in the list:\");\n" +
"            for (String element : list) {\n" +
"                System.out.print(element);\n" +
"            }\n" +
"        }\n" +
"    }\n" +
"\n" +
"    // Method to manage the list based on user input\n" +
"    public void manageList() {\n" +
"        Scanner scanner = new Scanner(System.in);\n" +
"\n" +
"        while (true) {\n" +
"            System.out.println(\"\\nChoose an option:\");\n" +
"            System.out.println(\"1. Add item\");\n" +
"            System.out.println(\"2. Delete item\");\n" +
"            System.out.println(\"3. Print list\");\n" +
"            System.out.println(\"4. Exit\");\n" +
"\n" +
"            int choice = scanner.nextInt();\n" +
"            scanner.nextLine(); // Consume the newline character\n" +
"\n" +
"            switch (choice) {\n" +
"                case 1:\n" +
"                    System.out.print(\"Enter item to add: \");\n" +
"                    String addElement = scanner.nextLine();\n" +
"                    addElement(addElement);\n" +
"                    break;\n" +
"\n" +
"                case 2:\n" +
"                    System.out.print(\"Enter item to delete: \");\n" +
"                    String deleteElement = scanner.nextLine();\n" +
"                    deleteElement(deleteElement);\n" +
"                    break;\n" +
"\n" +
"                case 3:\n" +
"                    printList();\n" +
"                    break;\n" +
"\n" +
"                case 4:\n" +
"                    System.out.println(\"Exiting program. Goodbye!\");\n" +
"                    System.exit(0);\n" +
"                    break;\n" +
"\n" +
"                default:\n" +
"                    System.out.println(\"Invalid choice. Please enter a number between 1 and 4.\");\n" +
"            }\n" +
"        }\n" +
"    }\n" +
"\n" +
"    public static void main(String[] args) {\n" +
"        FinalPortfolio myPortfolio = new FinalPortfolio();\n" +
"        myPortfolio.manageList();\n" +
"    }\n" +
"}");
                    break;
                case 2:
                    System.out.println("You selected: Linked List");
                    System.out.println("//LINKED LIST\n" +
"public class Main{  \n" +
"    //Represents the node of list.  \n" +
"    public class Node{  \n" +
"        int data;  \n" +
"        Node next;  \n" +
"        public Node(int data) {  \n" +
"            this.data = data;  \n" +
"        }  \n" +
"    }  \n" +
"  \n" +
"    //Declaring head and tail pointer as null.  \n" +
"    public Node head = null;  \n" +
"    public Node tail = null;  \n" +
"  \n" +
"    //This function will add the new node at the end of the list.  \n" +
"    public void add(int data){  \n" +
"        //Create new node  \n" +
"        Node newNode = new Node(data);  \n" +
"        //Checks if the list is empty.  \n" +
"        if(head == null) {  \n" +
"             //If list is empty, both head and tail would point to new node.  \n" +
"            head = newNode;  \n" +
"            tail = newNode;  \n" +
"            newNode.next = head;  \n" +
"        }  \n" +
"        else {  \n" +
"            //tail will point to new node.  \n" +
"            tail.next = newNode;  \n" +
"            //New node will become new tail.  \n" +
"            tail = newNode;  \n" +
"            //Since, it is circular linked list tail will point to head.  \n" +
"            tail.next = head;  \n" +
"        }  \n" +
"    }  \n" +
"  \n" +
"    //Displays all the nodes in the list  \n" +
"    public void display() {  \n" +
"        Node current = head;  \n" +
"        if(head == null) {  \n" +
"            System.out.println(\"List is empty\");  \n" +
"        }  \n" +
"        else {  \n" +
"            System.out.println(\"Nodes of the circular linked list: \");  \n" +
"             do{  \n" +
"                //Prints each node by incrementing pointer.  \n" +
"                System.out.print(\" \"+ current.data);  \n" +
"                current = current.next;  \n" +
"            }while(current != head);  \n" +
"            System.out.println();  \n" +
"        }  \n" +
"    }  \n" +
"  \n" +
"    public static void main(String[] args) {  \n" +
"		//Ask data drom users using Scanner method\n" +
"		Scanner input = new Scanner(System.in);\n" +
"        System.out.print(\"Enter data for 1st node: \");\n" +
"        int data1 = input.nextInt();\n" +
"        System.out.print(\"Enter data for 2nd node: \");\n" +
"        int data2 = input.nextInt();\n" +
"        Main cl = new Main();  \n" +
"       	System.out.print(\"Enter data for 3rd node: \");\n" +
"        int data3 = input.nextInt();\n" +
"        System.out.print(\"Enter data for 4th node: \");\n" +
"        int data4 = input.nextInt();\n" +
"        System.out.print(\"Enter data for 5th node: \");\n" +
"        int data5 = input.nextInt();\n" +
"        System.out.print(\"Enter data for 6th node: \");\n" +
"        int data6 = input.nextInt();\n" +
"        System.out.print(\"Enter data for 7th node: \");\n" +
"        int data7 = input.nextInt();\n" +
"        System.out.print(\"Enter data for 8th node: \");\n" +
"        int data8 = input.nextInt();\n" +
"        System.out.print(\"Enter data for 9th node: \");\n" +
"        int data9 = input.nextInt();\n" +
"        \n" +
"        //Adds data to the circular link list  \n" +
"        cl.add(data1);  \n" +
"        cl.add(data2);  \n" +
"        cl.add(data3);\n" +
"        cl.add(data4);\n" +
"        cl.add(data5);\n" +
"        cl.add(data6);\n" +
"        cl.add(data7);\n" +
"        cl.add(data8);\n" +
"        cl.add(data9);\n" +
"        \n" +
"        //Displays all the nodes present in the list  \n" +
"        cl.display();  \n" +
"        System.out.print(\"Sum of all nodes are: \" + (data1+data2+data3+data4+data5+data6+data7+data8+data9));\n" +
"    }\n" +
"}");
                    break;
                case 3:
                    System.out.println("You selected: Stack");
                    System.out.println("import java.util.Scanner;\n" +
"import java.util.Stack;\n" +
"\n" +
"public class stack {\n" +
"    public static void main(String[] args) {\n" +
"        Scanner scanner = new Scanner(System.in);\n" +
"        Stack<Integer> stack = new Stack<>();\n" +
"        \n" +
"        while (true) {\n" +
"            System.out.println(\"STACK OPERATIONS\");\n" +
"            System.out.println(\"[1] - Push\");\n" +
"            System.out.println(\"[2] - Pop\");\n" +
"            System.out.println(\"[3] - Print\");\n" +
"            System.out.println(\"[4] - Top\");\n" +
"           \n" +
"            System.out.print(\"ENTER YOUR CHOICE: \");\n" +
"            \n" +
"            int choice = scanner.nextInt();\n" +
"            \n" +
"            switch (choice) {\n" +
"                case 1:\n" +
"                    System.out.print(\"ENTER THE ELEMENT TO PUSH: \");\n" +
"                    int element = scanner.nextInt();\n" +
"                    stack.push(element);\n" +
"                    System.out.println(element + \" got pushed onto the stack.\");\n" +
"                    break;\n" +
"                \n" +
"                case 2:\n" +
"                    if (!stack.isEmpty()) {\n" +
"                        int poppedElement = stack.pop();\n" +
"                        System.out.println(\"Popped element: \" + poppedElement);\n" +
"                    } else {\n" +
"                        System.out.println(\"Stack is empty. Cannot pop.\");\n" +
"                    }\n" +
"                    break;\n" +
"                \n" +
"                case 3:\n" +
"                    if (!stack.isEmpty()) {\n" +
"                        System.out.print(\"Stack: \");\n" +
"                        for (Integer item : stack) {\n" +
"                            System.out.print(item + \" \");\n" +
"                        }\n" +
"                        System.out.println();\n" +
"                    } else {\n" +
"                        System.out.println(\"Stack is empty.\");\n" +
"                    }\n" +
"                    break;\n" +
"                \n" +
"                case 4:\n" +
"                    System.out.println(\"Top: \" + stack.peek());\n" +
"                    break;\n" +
"              \n" +
"            }\n" +
"        }\n" +
"    }\n" +
"}");
                    break;
                case 4:
                    System.out.println("You selected: Queue");
                    System.out.println("import java.util.Scanner;\n" +
"\n" +
"class Main {\n" +
"  public static void main(String[] args) {\n" +
"    Scanner queue = new Scanner(System.in);\n" +
"\n" +
"    System.out.print(\"Enter Cleartext: \");\n" +
"    String cleartext = queue.nextLine().toUpperCase();\n" +
"    System.out.print(\"Enter a value of k: \");\n" +
"    int k = queue.nextInt();\n" +
"\n" +
"    char[] clearArray = cleartext.toCharArray();\n" +
"    char[] cipherArray = encrypt(clearArray, k);\n" +
"\n" +
"    String ciphertext = new String(cipherArray);\n" +
"    System.out.print(\"Ciphertext: \" + ciphertext);\n" +
"\n" +
"    queue.close();\n" +
"  }\n" +
"\n" +
"  private static char[] encrypt(char[] text, int k) {\n" +
"    char[] result = new char[text.length];\n" +
"    for (int i = 0; i < text.length; i++) {\n" +
"      if (Character.isLetter(text[i])) {\n" +
"        char base = 'A';\n" +
"        result[i] = (char) ((text[i] - base + k) % 26 + base);\n" +
"      } else {\n" +
"        result[i] = text[i];\n" +
"      }\n" +
"    }\n" +
"    return result;\n" +
"  }\n" +
"} ");
                    break;
                case 5:
                    System.out.println("You selected: Tree");
                    System.out.println("class Node {\n" +
"    int item;\n" +
"    Node left, right;\n" +
"\n" +
"    public Node(int key) {\n" +
"        item = key;\n" +
"        left = right = null;\n" +
"    }\n" +
"}\n" +
"\n" +
"class Main {\n" +
"    // Root of the tree\n" +
"    Node root;\n" +
"\n" +
"    // Constructor to initialize the tree\n" +
"    public Main() {\n" +
"        root = null;\n" +
"    }\n" +
"\n" +
"    // Method to count leaf nodes in the tree\n" +
"    public static int countLeaf(Node node) {\n" +
"        if (node == null) {\n" +
"            return 0;\n" +
"        }\n" +
"        // If left and right of the node are null, it is a leaf node\n" +
"        if (node.left == null && node.right == null) {\n" +
"            return 1;\n" +
"        } else {\n" +
"            // Recursively count leaf nodes in the left and right subtrees\n" +
"            return countLeaf(node.left) + countLeaf(node.right);\n" +
"        }\n" +
"    }\n" +
"\n" +
"    public static void main(String[] args) {\n" +
"        // Create an object of the tree\n" +
"        Main tree = new Main();\n" +
"\n" +
"        // Create nodes of the tree\n" +
"        tree.root = new Node(15);\n" +
"        tree.root.left = new Node(13);\n" +
"        tree.root.right = new Node(14);\n" +
"\n" +
"        // Create child nodes of the left child\n" +
"        tree.root.left.left = new Node(10);\n" +
"        tree.root.left.right = new Node(9);\n" +
"\n" +
"        // Create child nodes of the left-left child\n" +
"        tree.root.left.left.left = new Node(1);\n" +
"        tree.root.left.left.right = new Node(2);\n" +
"\n" +
"        // Create child nodes of the left-right child\n" +
"        tree.root.left.right.left = new Node(3);\n" +
"        tree.root.left.right.right = new Node(4);\n" +
"\n" +
"        // Create child nodes of the right child\n" +
"        tree.root.right.left = new Node(12);\n" +
"        tree.root.right.right = new Node(11);\n" +
"\n" +
"        // Create child nodes of the right-left child\n" +
"        tree.root.right.left.left = new Node(5);\n" +
"        tree.root.right.left.right = new Node(6);\n" +
"\n" +
"        // Create child nodes of the right-right child\n" +
"        tree.root.right.right.left = new Node(7);\n" +
"        tree.root.right.right.right = new Node(8);\n" +
"\n" +
"        // Call the method to count leaf nodes\n" +
"        int leafNodes = countLeaf(tree.root);\n" +
"\n" +
"        // Print the number of leaf nodes in the tree\n" +
"        System.out.println(\"Number of leaf nodes in the tree: \" + leafNodes);\n" +
"    }\n" +
"}");
              
                    break;
                case 6:
                    System.out.println("You selected: Binary Tree");
                    System.out.println("class Node {\n" +
"  int item;\n" +
"  Node left, right;\n" +
"\n" +
"  public Node(int key) {\n" +
"    item = key;\n" +
"    left = right = null;\n" +
"  }\n" +
"}\n" +
"\n" +
"class Main {\n" +
"  // root of Tree\n" +
"  Node root;\n" +
"\n" +
"  Main() {\n" +
"    root = null;\n" +
"  }\n" +
"\n" +
"  // method to count leaf nodes\n" +
"  public static int countLeaf(Node node) {\n" +
"    if (node == null) {\n" +
"      return 0;\n" +
"    }\n" +
"    // if left and right of the node is null\n" +
"    // it is leaf node\n" +
"    if (node.left == null && node.right == null) {\n" +
"      return 1;\n" +
"    } else {\n" +
"      return countLeaf(node.left) + countLeaf(node.right);\n" +
"    }\n" +
"  }\n" +
"\n" +
"  public static void main(String[] args) {\n" +
"    // create an object of Tree\n" +
"    Main tree = new Main();\n" +
"    // create nodes of tree\n" +
"    tree.root = new Node(5);\n" +
"    tree.root.left = new Node(3);\n" +
"    tree.root.right = new Node(8);\n" +
"    // create child nodes of left child\n" +
"    tree.root.left.left = new Node(2);\n" +
"    tree.root.left.right = new Node(4);\n" +
"    // create child nodes of right child\n" +
"    tree.root.right.left = new Node(7);\n" +
"    tree.root.right.right = new Node(9);\n" +
"    // call method to count leaf nodes\n" +
"    int leafNodes = countLeaf(tree.root);\n" +
"    System.out.println(\"Total Leaf Nodes = \" + leafNodes);\n" +
"  }\n" +
"}");
                    break;
                case 7:
                    System.out.println("You selected: Graph");
                    System.out.println("class Main {\n" +
"// inner class\n" +
"// to keep track of edges\n" +
"class Edge {\n" +
"int src, dest;\n" +
"}\n" +
"// number of vertices and edges\n" +
"int vertices, edges;\n" +
"// array to store all edges\n" +
"Edge[] edge;\n" +
"Main(int vertices, int edges) {\n" +
"this.vertices = vertices;\n" +
"this.edges = edges;\n" +
"// initialize the edge array\n" +
"edge = new Edge[edges];\n" +
"for (int i = 0; i < edges; i++) {\n" +
"// each element of the edge array\n" +
"// is an object of Edge type\n" +
"edge[i] = new Edge();\n" +
"}\n" +
"}\n" +
"public static void main(String[] args) {\n" +
"// create an object of Graph class\n" +
"int noVertices = 10;\n" +
"int noEdges = 17;\n" +
"Main g = new Main(noVertices, noEdges);\n" +
"// create graph\n" +
"g.edge[0].src = 1; // edge 1---2\n" +
"g.edge[0].dest = 2;\n" +
"g.edge[1].src = 1; // edge 1---3\n" +
"g.edge[1].dest = 3;\n" +
"g.edge[2].src = 1; // edge 1---4\n" +
"g.edge[2].dest = 4;\n" +
"g.edge[3].src = 2; // edge 2---4\n" +
"g.edge[3].dest = 4;\n" +
"g.edge[4].src = 2; // edge 2---5\n" +
"g.edge[4].dest = 5;\n" +
"g.edge[5].src = 3; // edge 3---4\n" +
"g.edge[5].dest = 4;\n" +
"g.edge[6].src = 3; // edge 3---5\n" +
"g.edge[6].dest = 5;\n" +
"g.edge[7].src = 4; // edge 4---5\n" +
"g.edge[7].dest = 5;\n" +
"g.edge[8].src = 5; // edge 5---6\n" +
"g.edge[8].dest = 6;\n" +
"g.edge[9].src = 5; // edge 5---7\n" +
"g.edge[9].dest = 7;\n" +
"g.edge[10].src = 6; // edge 6---7\n" +
"g.edge[10].dest = 7;\n" +
"g.edge[11].src = 6; // edge 6---8\n" +
"\n" +
"g.edge[11].dest = 8;\n" +
"g.edge[12].src = 7; // edge 7---8\n" +
"g.edge[12].dest = 8;\n" +
"g.edge[13].src = 7; // edge 7---9\n" +
"g.edge[13].dest = 9;\n" +
"g.edge[14].src = 8; // edge 8---9\n" +
"g.edge[14].dest = 9;\n" +
"g.edge[15].src = 8; // edge 8---10\n" +
"g.edge[15].dest = 10;\n" +
"g.edge[16].src = 9; // edge 9---10\n" +
"g.edge[16].dest = 10;\n" +
"// print graph\n" +
"for (int i = 0; i < noEdges; i++) {\n" +
"System.out.println(g.edge[i].src + \" - \" + g.edge[i].dest);\n" +
"}\n" +
"}\n" +
"}");
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}