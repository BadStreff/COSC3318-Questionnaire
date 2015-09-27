/*
 * This file is part of COSC3318-Questionnaire.
 *
 *     COSC3318-Questionnaire is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     COSC3318-Questionnaire is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

package db;

/**
 * Note that this class is meant to be handled by the survey class.
 * You can think of a question object as the question along with its choices.
 * Type will be an enum most likely in the format TRUEFALSE,MULTIPLECHOICE,MULTIPLECHECK,OPEN
 * or something of that nature for velocity to parse it correctly.
 */

public class Question {
    final String question;
    final String[] choice;
    final QType type;

    public enum QType {
        TRUE_FALSE, MULTIPLE_CHOICE, MULTIPLE_SELECT, OPEN
    }

    public Question() {
        this.question = "";
        this.choice = new String[0];
        this.type = QType.OPEN;
    }

    public Question(String question, String[] choice, QType type) {
        this.question = question;
        this.choice = choice;
        this.type = type;
    }
}