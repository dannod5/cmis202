class TreeNode {
    Pokemon pokemon;
    TreeNode left, right;

    public TreeNode(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.left = this.right = null;
    }
}

class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(Pokemon pokemon) {
        root = insertRecursive(root, pokemon);
    }

    private TreeNode insertRecursive(TreeNode root, Pokemon pokemon) {
        if (root == null) {
            return new TreeNode(pokemon);
        }

        if (pokemon.generation < root.pokemon.generation) {
            root.left = insertRecursive(root.left, pokemon);
        } else if (pokemon.generation > root.pokemon.generation) {
            root.right = insertRecursive(root.right, pokemon);
        }

        return root;
    }

    // Other BST operations can be added here if needed

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println("Name: " + root.pokemon.name + ", Generation: " + root.pokemon.generation);
            inorderTraversal(root.right);
        }
    }

    public TreeNode getRoot() {
    }
}

public class PokemonSelector {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert Pokemon into BST
        for (Pokemon pokemon : pokemonList) {
            bst.insert(pokemon);
        }

        // Perform inorder traversal to display the sorted Pokemon by generation
        bst.inorderTraversal(bst.getRoot());
    }
}
