package ru.job4j.condition;

/**
 * @author shipilov (shipilov.89521049213@mail.ru)
 * @version $Id$
 * @since 23.11.2017
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String hi1=new string("Привет, Бот.");
        String hi2=new string("Привет, умник.");
        String bay1=new string("Пока.");
        String bay2=new string("До скорой встречи.");
        String error=new string("Это ставит меня в тупик. Спросите другой вопрос.");
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
