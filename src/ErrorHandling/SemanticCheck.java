package ErrorHandling;

import java.util.List;

public interface SemanticCheck {
    void check();                         // تنفيذ التحقق
    List<SemanticError> getErrors();      // استرجاع الأخطاء
    void printErrors();                   // طباعة الأخطاء
}
