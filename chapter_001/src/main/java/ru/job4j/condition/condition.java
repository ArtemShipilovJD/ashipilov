ackage ru.job4j.condition;

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
        String rs1="��� ������ ���� � �����. �������� ������ ������.";

        if("������, ���.".equals(question)){
			rs1="������, �����.";
			
        } else if("����.".equals(question)){ 
		    rs1="�� ������ �������.";
			
        }
                return rs1;
	    }
        
    
}