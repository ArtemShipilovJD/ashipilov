package ru.job4j.condition;

/**
 * @author shipilov (shipilov.89521049213@mail.ru)
 * @version $Id$
 * @since 23.11.2017
 */
public class DummyBot {
    /**
     * �������� �� �������.
     * @param question ������ �� �������.
     * @return �����.
     */
    public String answer(String question) {
        String hi1=new string("������, ���.");
        String hi2=new string("������, �����.");
        String bay1=new string("����.");
        String bay2=new string("�� ������ �������.");
        String error=new string("��� ������ ���� � �����. �������� ������ ������.");
        String x=new string("question");

        if(x.equals(hi1)){ return "h2";
        }
         else
            if(x.equals(bay1)){ return "bay2";
            }else{
                return "error";
			}
        
    }
}
