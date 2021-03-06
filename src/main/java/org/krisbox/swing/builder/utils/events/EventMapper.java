package org.krisbox.swing.builder.utils.events;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.awt.event.KeyEvent;

public class EventMapper {
    public EventMapper() {

    }

    public static int mapKeyEvent(String keyEvent) {
        switch(keyEvent) {
            case "KEY_FIRST":
                return KeyEvent.KEY_FIRST;
            case "KEY_LAST":
                return KeyEvent.KEY_LAST;
                
            case "KEY_TYPED":
                return KeyEvent.KEY_TYPED;
                
            case "KEY_PRESSED":
                return KeyEvent.KEY_PRESSED;
                
            case "KEY_RELEASED":
                return KeyEvent.KEY_RELEASED;
                
            case "VK_ENTER":
                return KeyEvent.VK_ENTER;
                
            case "VK_BACK_SPACE":
                return KeyEvent.VK_BACK_SPACE;
                
            case "VK_TAB":
                return KeyEvent.VK_TAB;
                
            case "VK_CANCEL":
                return KeyEvent.VK_CANCEL;
                
            case "VK_CLEAR":
                return KeyEvent.VK_CLEAR;
                
            case "VK_SHIFT":
                return KeyEvent.VK_SHIFT;
                
            case "VK_CONTROL":
                return KeyEvent.VK_CONTROL;
                
            case "VK_ALT":
                return KeyEvent.VK_ALT;
                
            case "VK_PAUSE":
                return KeyEvent.VK_PAUSE;
                
            case "VK_CAPS_LOCK":
                return KeyEvent.VK_CAPS_LOCK;
                
            case "VK_ESCAPE":
                return KeyEvent.VK_ESCAPE;
                
            case "VK_SPACE":
                return KeyEvent.VK_SPACE;
                
            case "VK_PAGE_UP":
                return KeyEvent.VK_PAGE_UP;
                
            case "VK_PAGE_DOWN":
                return KeyEvent.VK_PAGE_DOWN;
                
            case "VK_END":
                return KeyEvent.VK_END;
                
            case "VK_HOME":
                return KeyEvent.VK_HOME;
                
            case "VK_LEFT":
                return KeyEvent.VK_LEFT;
                
            case "VK_UP":
                return KeyEvent.VK_UP;
                
            case "VK_RIGHT":
                return KeyEvent.VK_RIGHT;
                
            case "VK_DOWN":
                return KeyEvent.VK_DOWN;
                
            case "VK_COMMA":
                return KeyEvent.VK_COMMA;
                
            case "VK_MINUS":
                return KeyEvent.VK_MINUS;
                
            case "VK_PERIOD":
                return KeyEvent.VK_PERIOD;
                
            case "VK_SLASH":
                return KeyEvent.VK_SLASH;
                
            case "VK_0":
                return KeyEvent.VK_0;
                
            case "VK_1":
                return KeyEvent.VK_1;
                
            case "VK_2":
                return KeyEvent.VK_2;
                
            case "VK_3":
                return KeyEvent.VK_3;
                
            case "VK_4":
                return KeyEvent.VK_4;
                
            case "VK_5":
                return KeyEvent.VK_5;
                
            case "VK_6":
                return KeyEvent.VK_6;
                
            case "VK_7":
                return KeyEvent.VK_7;
                
            case "VK_8":
                return KeyEvent.VK_8;
                
            case "VK_9":
                return KeyEvent.VK_9;
                
            case "VK_SEMICOLON":
                return KeyEvent.VK_SEMICOLON;
                
            case "VK_EQUALS":
                return KeyEvent.VK_EQUALS;
                
            case "VK_A":
                return KeyEvent.VK_A;
                
            case "VK_B":
                return KeyEvent.VK_B;
                
            case "VK_C":
                return KeyEvent.VK_C;
                
            case "VK_D":
                return KeyEvent.VK_D;
                
            case "VK_E":
                return KeyEvent.VK_E;
                
            case "VK_F":
                return KeyEvent.VK_F;
                
            case "VK_G":
                return KeyEvent.VK_G;
                
            case "VK_H":
                return KeyEvent.VK_H;
                
            case "VK_I":
                return KeyEvent.VK_I;
                
            case "VK_J":
                return KeyEvent.VK_J;
                
            case "VK_K":
                return KeyEvent.VK_K;
                
            case "VK_L":
                return KeyEvent.VK_L;
                
            case "VK_M":
                return KeyEvent.VK_M;
                
            case "VK_N":
                return KeyEvent.VK_N;
                
            case "VK_O":
                return KeyEvent.VK_O;
                
            case "VK_P":
                return KeyEvent.VK_P;
                
            case "VK_Q":
                return KeyEvent.VK_Q;
                
            case "VK_R":
                return KeyEvent.VK_R;
                
            case "VK_S":
                return KeyEvent.VK_S;
                
            case "VK_T":
                return KeyEvent.VK_T;
                
            case "VK_U":
                return KeyEvent.VK_U;
                
            case "VK_V":
                return KeyEvent.VK_V;
                
            case "VK_W":
                return KeyEvent.VK_W;
                
            case "VK_X":
                return KeyEvent.VK_X;
                
            case "VK_Y":
                return KeyEvent.VK_Y;
                
            case "VK_Z":
                return KeyEvent.VK_Z;
                
            case "VK_OPEN_BRACKET":
                return KeyEvent.VK_OPEN_BRACKET;
                
            case "VK_BACK_SLASH":
                return KeyEvent.VK_BACK_SLASH;
                
            case "VK_CLOSE_BRACKET":
                return KeyEvent.VK_CLOSE_BRACKET;
                
            case "VK_NUMPAD0":
                return KeyEvent.VK_NUMPAD0;
                
            case "VK_NUMPAD1":
                return KeyEvent.VK_NUMPAD1;
                
            case "VK_NUMPAD2":
                return KeyEvent.VK_NUMPAD2;
                
            case "VK_NUMPAD3":
                return KeyEvent.VK_NUMPAD3;
                
            case "VK_NUMPAD4":
                return KeyEvent.VK_NUMPAD4;
                
            case "VK_NUMPAD5":
                return KeyEvent.VK_NUMPAD5;
                
            case "VK_NUMPAD6":
                return KeyEvent.VK_NUMPAD6;
                
            case "VK_NUMPAD7":
                return KeyEvent.VK_NUMPAD7;
                
            case "VK_NUMPAD8":
                return KeyEvent.VK_NUMPAD8;
                
            case "VK_NUMPAD9":
                return KeyEvent.VK_NUMPAD9;
                
            case "VK_MULTIPLY":
                return KeyEvent.VK_MULTIPLY;
                
            case "VK_ADD":
                return KeyEvent.VK_ADD;
                
            case "VK_SEPARATER":
                return KeyEvent.VK_SEPARATER;
                
            case "VK_SEPARATOR":
                return KeyEvent.VK_SEPARATOR;
                
            case "VK_SUBTRACT":
                return KeyEvent.VK_SUBTRACT;
                
            case "VK_DECIMAL":
                return KeyEvent.VK_DECIMAL;
                
            case "VK_DIVIDE":
                return KeyEvent.VK_DIVIDE;
                
            case "VK_DELETE":
                return KeyEvent.VK_DELETE;
                
            case "VK_NUM_LOCK":
                return KeyEvent.VK_NUM_LOCK;
                
            case "VK_SCROLL_LOCK":
                return KeyEvent.VK_SCROLL_LOCK;
                
            case "VK_F1":
                return KeyEvent.VK_F1;
                
            case "VK_F2":
                return KeyEvent.VK_F2;
                
            case "VK_F3":
                return KeyEvent.VK_F3;
                
            case "VK_F4":
                return KeyEvent.VK_F4;
                
            case "VK_F5":
                return KeyEvent.VK_F5;
                
            case "VK_F6":
                return KeyEvent.VK_F6;
                
            case "VK_F7":
                return KeyEvent.VK_F7;
                
            case "VK_F8":
                return KeyEvent.VK_F8;
                
            case "VK_F9":
                return KeyEvent.VK_F9;
                
            case "VK_F10":
                return KeyEvent.VK_F10;
                
            case "VK_F11":
                return KeyEvent.VK_F11;
                
            case "VK_F12":
                return KeyEvent.VK_F12;
                
            case "VK_F13":
                return KeyEvent.VK_F13;
                
            case "VK_F14":
                return KeyEvent.VK_F14;
                
            case "VK_F15":
                return KeyEvent.VK_F15;
                
            case "VK_F16":
                return KeyEvent.VK_F16;
                
            case "VK_F17":
                return KeyEvent.VK_F17;
                
            case "VK_F18":
                return KeyEvent.VK_F18;
                
            case "VK_F19":
                return KeyEvent.VK_F19;
                
            case "VK_F20":
                return KeyEvent.VK_F20;
                
            case "VK_F21":
                return KeyEvent.VK_F21;
                
            case "VK_F22":
                return KeyEvent.VK_F22;
                
            case "VK_F23":
                return KeyEvent.VK_F23;
                
            case "VK_F24":
                return KeyEvent.VK_F24;
                
            case "VK_PRINTSCREEN":
                return KeyEvent.VK_PRINTSCREEN;
                
            case "VK_INSERT":
                return KeyEvent.VK_INSERT;
                
            case "VK_HELP":
                return KeyEvent.VK_HELP;
                
            case "VK_META":
                return KeyEvent.VK_META;
                
            case "VK_BACK_QUOTE":
                return KeyEvent.VK_BACK_QUOTE;
                
            case "VK_QUOTE":
                return KeyEvent.VK_QUOTE;
                
            case "VK_KP_UP":
                return KeyEvent.VK_KP_UP;
                
            case "VK_KP_DOWN":
                return KeyEvent.VK_KP_DOWN;
                
            case "VK_KP_LEFT":
                return KeyEvent.VK_KP_LEFT;
                
            case "VK_KP_RIGHT":
                return KeyEvent.VK_KP_RIGHT;
                
            case "VK_DEAD_GRAVE":
                return KeyEvent.VK_DEAD_GRAVE;
                
            case "VK_DEAD_ACUTE":
                return KeyEvent.VK_DEAD_ACUTE;
                
            case "VK_DEAD_CIRCUMFLEX":
                return KeyEvent.VK_DEAD_CIRCUMFLEX;
                
            case "VK_DEAD_TILDE":
                return KeyEvent.VK_DEAD_TILDE;
                
            case "VK_DEAD_MACRON":
                return KeyEvent.VK_DEAD_MACRON;
                
            case "VK_DEAD_BREVE":
                return KeyEvent.VK_DEAD_BREVE;
                
            case "VK_DEAD_ABOVEDOT":
                return KeyEvent.VK_DEAD_ABOVEDOT;
                
            case "VK_DEAD_DIAERESIS":
                return KeyEvent.VK_DEAD_DIAERESIS;
                
            case "VK_DEAD_ABOVERING":
                return KeyEvent.VK_DEAD_ABOVERING;
                
            case "VK_DEAD_DOUBLEACUTE":
                return KeyEvent.VK_DEAD_DOUBLEACUTE;
                
            case "VK_DEAD_CARON":
                return KeyEvent.VK_DEAD_CARON;
                
            case "VK_DEAD_CEDILLA":
                return KeyEvent.VK_DEAD_CEDILLA;
                
            case "VK_DEAD_OGONEK":
                return KeyEvent.VK_DEAD_OGONEK;
                
            case "VK_DEAD_IOTA":
                return KeyEvent.VK_DEAD_IOTA;
                
            case "VK_DEAD_VOICED_SOUND":
                return KeyEvent.VK_DEAD_VOICED_SOUND;
                
            case "VK_DEAD_SEMIVOICED_SOUND":
                return KeyEvent.VK_DEAD_SEMIVOICED_SOUND;
                
            case "VK_AMPERSAND":
                return KeyEvent.VK_AMPERSAND;
                
            case "VK_ASTERISK":
                return KeyEvent.VK_ASTERISK;
                
            case "VK_QUOTEDBL":
                return KeyEvent.VK_QUOTEDBL;
                
            case "VK_LESS":
                return KeyEvent.VK_LESS;
                
            case "VK_GREATER":
                return KeyEvent.VK_GREATER;
                
            case "VK_BRACELEFT":
                return KeyEvent.VK_BRACELEFT;
                
            case "VK_BRACERIGHT":
                return KeyEvent.VK_BRACERIGHT;
                
            case "VK_AT":
                return KeyEvent.VK_AT;
                
            case "VK_COLON":
                return KeyEvent.VK_COLON;
                
            case "VK_CIRCUMFLEX":
                return KeyEvent.VK_CIRCUMFLEX;
                
            case "VK_DOLLAR":
                return KeyEvent.VK_DOLLAR;
                
            case "VK_EURO_SIGN":
                return KeyEvent.VK_EURO_SIGN;
                
            case "VK_EXCLAMATION_MARK":
                return KeyEvent.VK_EXCLAMATION_MARK;
                
            case "VK_INVERTED_EXCLAMATION_MARK":
                return KeyEvent.VK_INVERTED_EXCLAMATION_MARK;
                
            case "VK_LEFT_PARENTHESIS":
                return KeyEvent.VK_LEFT_PARENTHESIS;
                
            case "VK_NUMBER_SIGN":
                return KeyEvent.VK_NUMBER_SIGN;
                
            case "VK_PLUS":
                return KeyEvent.VK_PLUS;
                
            case "VK_RIGHT_PARENTHESIS":
                return KeyEvent.VK_RIGHT_PARENTHESIS;
                
            case "VK_UNDERSCORE":
                return KeyEvent.VK_UNDERSCORE;
                
            case "VK_WINDOWS":
                return KeyEvent.VK_WINDOWS;
                
            case "VK_CONTEXT_MENU":
                return KeyEvent.VK_CONTEXT_MENU;
                
            case "VK_FINAL":
                return KeyEvent.VK_FINAL;
                
            case "VK_CONVERT":
                return KeyEvent.VK_CONVERT;
                
            case "VK_NONCONVERT":
                return KeyEvent.VK_NONCONVERT;
                
            case "VK_ACCEPT":
                return KeyEvent.VK_ACCEPT;
                
            case "VK_MODECHANGE":
                return KeyEvent.VK_MODECHANGE;
                
            case "VK_KANA":
                return KeyEvent.VK_KANA;
                
            case "VK_KANJI":
                return KeyEvent.VK_KANJI;
                
            case "VK_ALPHANUMERIC":
                return KeyEvent.VK_ALPHANUMERIC;
                
            case "VK_KATAKANA":
                return KeyEvent.VK_KATAKANA;
                
            case "VK_HIRAGANA":
                return KeyEvent.VK_HIRAGANA;
                
            case "VK_FULL_WIDTH":
                return KeyEvent.VK_FULL_WIDTH;
                
            case "VK_HALF_WIDTH":
                return KeyEvent.VK_HALF_WIDTH;
                
            case "VK_ROMAN_CHARACTERS":
                return KeyEvent.VK_ROMAN_CHARACTERS;
                
            case "VK_ALL_CANDIDATES":
                return KeyEvent.VK_ALL_CANDIDATES;
                
            case "VK_PREVIOUS_CANDIDATE":
                return KeyEvent.VK_PREVIOUS_CANDIDATE;
                
            case "VK_CODE_INPUT":
                return KeyEvent.VK_CODE_INPUT;
                
            case "VK_JAPANESE_KATAKANA":
                return KeyEvent.VK_JAPANESE_KATAKANA;
                
            case "VK_JAPANESE_HIRAGANA":
                return KeyEvent.VK_JAPANESE_HIRAGANA;
                
            case "VK_JAPANESE_ROMAN":
                return KeyEvent.VK_JAPANESE_ROMAN;
                
            case "VK_KANA_LOCK":
                return KeyEvent.VK_KANA_LOCK;
                
            case "VK_INPUT_METHOD_ON_OFF":
                return KeyEvent.VK_INPUT_METHOD_ON_OFF;
                
            case "VK_CUT":
                return KeyEvent.VK_CUT;
                
            case "VK_COPY":
                return KeyEvent.VK_COPY;
                
            case "VK_PASTE":
                return KeyEvent.VK_PASTE;
                
            case "VK_UNDO":
                return KeyEvent.VK_UNDO;
                
            case "VK_AGAIN":
                return KeyEvent.VK_AGAIN;
                
            case "VK_FIND":
                return KeyEvent.VK_FIND;
                
            case "VK_PROPS":
                return KeyEvent.VK_PROPS;
                
            case "VK_STOP":
                return KeyEvent.VK_STOP;
                
            case "VK_COMPOSE":
                return KeyEvent.VK_COMPOSE;
                
            case "VK_ALT_GRAPH":
                return KeyEvent.VK_ALT_GRAPH;
                
            case "VK_BEGIN":
                return KeyEvent.VK_BEGIN;
                
            case "VK_UNDEFINED":
                return KeyEvent.VK_UNDEFINED;
                
            case "CHAR_UNDEFINED":
                return KeyEvent.CHAR_UNDEFINED;
                
            case "KEY_LOCATION_UNKNOWN":
                return KeyEvent.KEY_LOCATION_UNKNOWN;
                
            case "KEY_LOCATION_STANDARD":
                return KeyEvent.KEY_LOCATION_UNKNOWN;
                
            case "KEY_LOCATION_LEFT":
                return KeyEvent.KEY_LOCATION_LEFT;
                
            case "KEY_LOCATION_RIGHT":
                return KeyEvent.KEY_LOCATION_RIGHT;
                
            case "KEY_LOCATION_NUMPAD":
                return KeyEvent.KEY_LOCATION_NUMPAD;
                
        }

        return 0;
    }
}
