package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author shipilov (shipilov.89521049213@mail.ru)
 * @version $Id$
 * @since 23.11.2017
 */
public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("������, ���."),
                is("������, �����.")
        );
    }

    @Test
    public void whenByuBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("����."),
                is("�� ������ �������.")
        );
    }

    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("������� ����� 2 + 2?"),
                is("��� ������ ���� � �����. �������� ������ ������.")
        );
    }
}