package ua.java.dsa.tree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrefixTree {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("/home/anton/My programs/demo/src/main/resources/numbers.txt"));

        TreeNode root = new TreeNode(' ');
        lines.forEach(root::insert);

//        System.out.println(root.containString("18AA0603"));
//        System.out.println(root.containString("18АА0597"));

        writeTreeToFile("/home/anton/My programs/demo/src/main/resources/tree.dat", root);

        TreeNode treeFromFile = readTreeFromFile("/home/anton/My programs/demo/src/main/resources/tree.dat");

        List<String> extractedFromTree = new ArrayList<>();
        treeFromFile.getAllNumbers("", extractedFromTree);
    }

    static class TreeNode {
        char value;
        List<TreeNode> children;

        public TreeNode(char value) {
            this.value = value;
        }

        public void insert(String data) {
            if (data.isEmpty()) {
                return;
            }
            if (children == null) {
                children = new ArrayList<>();
            }
            char c = data.charAt(0);
            TreeNode child = findNodeByChar(c);
            if (child == null) {
                child = new TreeNode(c);
                children.add(child);
            }
            child.insert(data.substring(1));
        }

        private TreeNode findNodeByChar(char c) {
            if (children != null) {
                for (TreeNode node : children) {
                    if (node.value == c) {
                        return node;
                    }
                }
            }
            return null;
        }

        private boolean containString(String string) {
            TreeNode current = this;
            for (int i = 0; i < string.length(); i++) {
                current = current.findNodeByChar(string.charAt(i));
                if (current == null) {
                    return false;
                }
            }
            return true;
        }

        public void getAllNumbers(String path, List<String> result) {
            if (value != ' ') {
                path += value;
            }

            if (children != null) {
                for (TreeNode treeNode : children) {
                    treeNode.getAllNumbers(path, result);
                }
            } else {
                result.add(path);
            }
        }

        public void writeToFile(PrintWriter writer) {
            writer.write(value);
            if (children != null) {
                for (TreeNode treeNode : children) {
                    treeNode.writeToFile(writer);
                }
            }
            writer.write(']');
        }

        public void readFromFile(FileReader reader) throws IOException {
            char ch;
            while ((ch = (char) reader.read()) != ']') {
                TreeNode treeNode = new TreeNode(ch);
                treeNode.readFromFile(reader);
                if (children == null) {
                    children = new ArrayList<>();
                }
                children.add(treeNode);
            }
        }
    }

    public static void writeTreeToFile(String path, TreeNode root) {
        try {
            PrintWriter out = new PrintWriter(path);
            root.writeToFile(out);
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static TreeNode readTreeFromFile(String path) {
        TreeNode root = new TreeNode(' ');
        try (FileReader fileReader = new FileReader(path)) {
            fileReader.read();//skip ' ', as it was created before

            root.readFromFile(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return root;
    }
}
