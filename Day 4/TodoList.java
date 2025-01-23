import java.util.*;

public class TodoList {
    private ArrayList<String> todos;
    private ArrayList<Boolean> completed;
    Scanner sc = new Scanner(System.in);
    
    public TodoList() {
        todos = new ArrayList<>();
        completed = new ArrayList<>();
    }
    
    private void displayMenu() {
        System.out.println("\n=== Todo List Menu ===");
        System.out.println("1. Add Todo");
        System.out.println("2. List Todos");
        System.out.println("3. Delete Todo");
        System.out.println("4. Mark Todo as Completed/Uncompleted");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }
    
    private void addTodo() {
        System.out.print("Enter your todo: ");
        String todo = sc.nextLine();
        todos.add(todo);
        completed.add(false);
        System.out.println("Todo added!");
    }
    
    private void listTodos() {
        if (todos.isEmpty()) {
            System.out.println("No todos found!");
        } else {
            System.out.println("\nYour Todos:");
            for (int i = 0; i < todos.size(); i++) {
                String status = completed.get(i) ? "[✓]" : "[ ]";
                System.out.println((i + 1) + ". " + status + " " + todos.get(i));
            }
        }
    }
    
    private void deleteTodo() {
        if (todos.isEmpty()) {
            System.out.println("No todos to delete!");
            return;
        }
        
        listTodos();
        System.out.print("Enter todo number to delete: ");
        int index = sc.nextInt() - 1;
        
        if (index >= 0 && index < todos.size()) {
            todos.remove(index);
            completed.remove(index); 
            System.out.println("Todo deleted!");
        } else {
            System.out.println("Invalid todo number!");
        }
    }
    
    private void toggleCompletion() {  
        if (todos.isEmpty()) {
            System.out.println("No todos to mark!");
            return;
        }
        
        listTodos();
        System.out.print("Enter todo number to toggle completion: ");
        int index = sc.nextInt() - 1;
        
        if (index >= 0 && index < todos.size()) {
            completed.set(index, !completed.get(index));
            String status = completed.get(index) ? "completed" : "uncompleted";
            System.out.println("Todo marked as " + status + "!");
        } else {
            System.out.println("Invalid todo number!");
        }
    }
    
    public void operation() {
        int choice;
        do {
            displayMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addTodo();
                    break;
                case 2:
                    listTodos();
                    break;
                case 3:
                    deleteTodo();
                    break;
                case 4:
                    toggleCompletion();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
        
        sc.close();
    }
    
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.operation();
    }
}