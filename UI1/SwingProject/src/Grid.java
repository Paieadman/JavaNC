import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Vector;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Grid extends JFrame {
    JTable tab;
    Vector<Vector<String>> vec;
    public Grid() throws FileNotFoundException {
        super("Library");
        Vector<String> v = new Vector<String>();

        v.add("ISBN");
        v.add("Name");
        v.add("paper");
        vec = new Vector<Vector<String>>();
        reader();
        tab = new JTable(vec, v);
        Box content = new Box(BoxLayout.Y_AXIS);
        content.add(new JScrollPane(tab, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
        getContentPane().add(content);


        JPanel s = new JPanel(new GridLayout(2,4));
        JPanel ins = new JPanel(new GridLayout());
        JTextField a0 = new JTextField("ISBN");
        JTextField a1 = new JTextField("Name of book");
        JTextField a2 = new JTextField("1-good paper, 2-not");
        ins.add(a0);
        ins.add(a1);
        ins.add(a2);
        JButton ad = new JButton("add");
        ins.add(ad);
        s.add(ins, BorderLayout.NORTH);
        ad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//            addBook(new Book(Integer.parseInt(a0.getText()),
//                    a1.getText(),
//                    (Integer.parseInt(a2.getText()) > 0) ? new Boolean(true) : new Boolean(false)));

                int tmpISBN = 0;
                int tmpPaper =0;
                Boolean tmp = true;
                try {
                    tmpISBN = Integer.parseInt(a0.getText());
                } catch (NumberFormatException ex){
                    System.out.println("isbn");
                }
                try{
                    tmpPaper = Integer.parseInt(a2.getText());
                    tmp = (tmpPaper == 1)? true:false;
                } catch (NumberFormatException ex){
                    System.out.println("paper");
                }
                String tmpName = a1.getText();
                try {
                    addBook(new Book(tmpISBN, tmpName, tmp));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }


        });

        JTextField num = new JTextField("Number of book");
        JPanel del = new JPanel(new GridLayout());
        JButton delB = new JButton("delete");
        delB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int tmp = Integer.parseInt(num.getText());
                    delBook(tmp);
                } catch (NumberFormatException ex){

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        del.add(num);
        del.add(delB);
        JTextField textEdit0 = new JTextField("number of book");
        JTextField textEdit1 = new JTextField("attribute");
        JTextField textEdit2 = new JTextField("info");
        JButton buttonEdit = new JButton("edit");
        buttonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int tmpPos1 = Integer.parseInt(textEdit0.getText());
                    try {
                        int tmpPos2 = Integer.parseInt(textEdit1.getText());
                        String tmpData = textEdit2.getText();
                        if(tmpPos2 == 3){
                            int th = Integer.parseInt(tmpData);
                            if(th == 1){
                                tmpData = "good paper";
                            } else {
                                if(th == 2){
                                    tmpData = "second-life paper";
                                }
                            }
                        }
                        setSmth(tmpData, tmpPos1,tmpPos2);
                    } catch (NumberFormatException ex){

                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } catch(NumberFormatException ex){

                }
            }
        });
        JPanel edit = new JPanel(new GridLayout());
        edit.add(textEdit0);
        edit.add(textEdit1);
        edit.add(textEdit2);
        edit.add(buttonEdit);

        JPanel hi = new JPanel(new GridLayout());
        hi.add(del, BorderLayout.SOUTH);
        hi.add(edit, BorderLayout.NORTH);
        s.add(hi, BorderLayout.SOUTH);
        getContentPane().add(s, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public void addBook(Book book) throws IOException {
        Vector<String> v = new Vector<>();
        v.add(String.valueOf(book.getISBN()));
        v.add(book.getName());
        v.add(book.getPaper() ? "good paper" : "second-life paper");
        vec.add(v);
        pack();
        setVisible(true);
        writer();
    }

    public void delBook(int num) throws IOException {
        if(vec.size()<num && num>0) {
            vec.remove(num);
            pack();
            setVisible(true);
            writer();
        }
    }

    public void setSmth(String str, int pos1, int pos2) throws IOException {
        if(vec.size() > pos1 && pos1 >=0 && pos2>0 && pos2<4) { //change here
            vec.get(pos1-1).set(pos2-1, str);
            pack();
            setVisible(true);
            writer();
        }
    }

    public void writer() throws IOException {
        JSONArray jarr = new JSONArray();
        for (Vector<String> i: vec){
            JSONObject ob = new JSONObject();
            try {
                ob.put("ISBN", i.get(0));
                ob.put("Name", i.get(1));
                ob.put("Paper", i.get(2));
                //jarr.put(ob);
                jarr.add(ob);
                Writer data = new FileWriter("data.txt");
                data.write(jarr.toJSONString());
                data.flush();
                data.close();
            } catch (Exception exe){

            }
        }
    }

    public void reader() throws FileNotFoundException {
        JSONParser parser = new JSONParser();
        try {
            JSONArray object = (JSONArray)parser.parse(new FileReader("data.txt"));
            for(int i = 0; i<object.size()-1; i++){
                Vector<String> v = new Vector<>();
                v.add((String) ((JSONObject)object.get(i)).get("ISBN"));
                v.add((String) ((JSONObject)object.get(i)).get("Name"));
                v.add((String) ((JSONObject)object.get(i)).get("Paper"));
                vec.add(v);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pack();
        setVisible(true);
    }
}
