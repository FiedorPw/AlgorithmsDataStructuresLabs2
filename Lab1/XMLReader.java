package Lab1;
import java.io.*;
import java.util.Stack;


public class XMLReader {
    @Override
    public String toString() {
        return "XMLReader{}";
    }

    static public void main(String[] arg){
        Stack<String> stack = new Stack<>();
        stack.add("test");

        try {
                File file = new File("/home/kolaj/IdeaProjects/Apro2/Lab1/test1.xml");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String line = "kkkkkkkkk";

                while ((line = bufferedReader.readLine()) != null) {
                    stringBuffer.append(line);
                    stringBuffer.append("\n");
                }
                fileReader.close();
                bufferedReader.close();
                String xmlString = stringBuffer.toString();


                for (int i = 0; i < xmlString.length(); i++) {

                    int j = 0;
                    if ((int) ('<') == (int) (xmlString.charAt(i))) {
                        while ((int) ('>') != (int) (xmlString.charAt(i + j))) {
                            j++;

                        }
                        System.out.println("");
                        System.out.println(stack.peek() + "|" + xmlString.substring(i + 2, i + j));

                        if (stack.peek().equals(xmlString.substring(i + 2, i + j)) && stack.size() != 0) {
                            System.out.println("POP " + xmlString.substring(i + 2, i + j));
                            stack.pop();

                        } else {
                            System.out.println("ADD " + xmlString.substring(i + 1, i + j));
                            stack.push(xmlString.substring(i + 1, i + j));

                            String substring = xmlString.substring(i + 1, i + j);
                            System.out.println(xmlString.substring(i+1,i+j));
                        }
                    }


                }
                stack.pop();
                //stack.pop();
                //popowanie dodatokowego elmętu i wersji xml

                if (stack.size() == 0) {
                    System.out.println("xml jest dobrze sformatowany");

                } else {
                    System.out.println(stack);
                    while(stack.size() != 0) {
                        if (stack.pop().matches("YEAR|/YEAR|PRICE|/PRICE|CD|/CD")) {
                            System.out.println("xml nie jest dobrze sformatowany");
                            break;
                        }else {

                        }


                    }
                }

            } catch (Exception e) {
                System.out.println("wysypało sie");
            }
        }
    }





