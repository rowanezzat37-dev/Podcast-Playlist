public class playlist {
    Node head;
    Node current;
    void AddEpisode(String title,int id,int duration,String category){
        if (head==null){
            Node newNode = new Node(title,id,duration,category);
            head = newNode;
            current=head;
        }else {
            Node temp =head;
            while (temp.next!=null){
                temp=temp.next;
            }
            Node newNode = new Node(title,id,duration,category);
            temp.next= newNode;
            newNode.next=null;
        }

    }
    void DeleteEpisode(int id){
        if (head==null){
            System.out.println("No Episode to Delete!!!");
        }else {
            Node temp=head;
            Node prev= temp;
            while (temp!= null){
                if (temp.id==id)
                    break;
                prev=temp;
                temp=temp.next;
            }
            if (temp==null){
                System.out.println("ID Not Available!!!");
            }else if (temp==head){
                current=temp.next;
                head=temp.next;
            }else if (temp.next==null){
                if (current==temp){
                    current=prev;
                }
                prev.next=null;
            }
            else {
                if (current==temp){
                    current=prev;
                }
                prev.next=temp.next;
            }
        }

    }
    void traverse(){
        Node temp = head;
        int count =1;
        if (head==null){
            System.out.println("No Available Episodes!!!");
            return;
        }
        while (temp!=null){
            System.out.println("===========================");
            System.out.println("Episode "+count+":");
            System.out.println("Title: "+temp.title);
            System.out.println("ID: "+temp.id);
            System.out.println("Duration: "+temp.duration);
            System.out.println("Category: "+temp.category);
            System.out.println("===========================");
            temp=temp.next;
            count++;
        }
    }
    void searchCategory(String category){
        Node temp=head;
        boolean change=false;
        while (temp!=null){
            if (temp.category.equalsIgnoreCase(category)){
                System.out.println(temp.title);
                change=true;
            }
            temp=temp.next;
        }
        if (!change){
            System.out.println("Category Not Found!!!");
        }
    }
    void getTotalListeningTime(){
        Node temp = head;
        int count=0;
        while (temp!=null){
            count+=temp.duration;
            temp=temp.next;
        }
        System.out.println("Total Listening Time: "+count);
    }
    void insert(String title,int id,int duration,String category,int pos){
        if (pos<=0){
            System.out.println("Invalid position!!!");
            return;
        }
        if (pos==1){
            Node newNode = new Node(title,id,duration,category);
            newNode.next=head;
            head=newNode;
            if (newNode.next==null){
                current=head;
            }
        }
        else {
            Node temp = head;
            int count=1;
            while (temp!=null&& count<pos-1){
                temp=temp.next;
                count++;
            }
            if (temp==null){
                System.out.println("Invalid Position!!!");
            }else if (temp.next==null){
                Node newNode = new Node(title,id,duration,category);
                temp.next=newNode;
            }else {
                Node newNode = new Node(title,id,duration,category);
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }

    }
    void playNextEpisode(){
        if (current==null){
            System.out.println("Playlist is Empty!!!");
            return;
        }
        if (current.next==null){
            System.out.println("End of playlist reached.");
        }else {
            current=current.next;
            System.out.println("===========================");
            System.out.println("Title: "+current.title);
            System.out.println("ID: "+current.id);
            System.out.println("Duration: "+current.duration);
            System.out.println("Category: "+current.category);
            System.out.println("===========================");
        }
    }
    public  static void main(String[] args) {
        System.out.println("Test 1:\n");




        playlist p1= new playlist();

        p1.AddEpisode("Business Basics",1,30,"bis");
        p1.AddEpisode("Intro to IT",2,20,"it");
        p1.AddEpisode("HR Skills",3,40,"hr");
        p1.traverse();
        p1.DeleteEpisode(2);
        p1.traverse();
        p1.searchCategory("bis");
        p1.getTotalListeningTime();
        p1.playNextEpisode();
        p1.playNextEpisode();

        System.out.println("\n\nTest 2:\n");
        playlist p2= new playlist();

        p2.AddEpisode("AI Intro",1,25,"ai");
        p2.AddEpisode("Data Science",2,35,"data");
        p2.insert("Machine Learning",3,45,"ai",2);
        p2.traverse();
        p2.DeleteEpisode(10);
        p2.searchCategory("security");
        p2.getTotalListeningTime();
        p2.playNextEpisode();
        p2.playNextEpisode();
        p2.playNextEpisode();
    }
}
class Node{
    String title;
    int id;
    int duration;
    String category;
    Node next;

    Node(String title,int id,int duration,String category){
        this.title=title;
        this.id=id;
        this.duration=duration;
        this.category=category;
    }
}