# Проект "Заметки"

## Цели проекта:

### Интерфейс пользователя:
- Создан базовый интерфейс с использованием LinearLayout и RecyclerView для отображения списка заметок.
- Добавлена кнопка для создания новой заметки.

### Функциональность:
- Реализована возможность добавления новой заметки.
- Реализована возможность удаления заметки путем свайпа влево или вправо.
- Добавлена возможность редактирования существующей заметки.

### Хранение данных:
- Для хранения заметок используется SharedPreferences, что является простым способом для сохранения данных, особенно для новичков.

### Дополнительные функции:
- Добавлена функция поиска для фильтрации заметок по ключевым словам.
- Реализовано сохранение даты последнего редактирования заметки.

## Пошаговый план реализации:

### Настройка проекта в Android Studio:
1. Создать новый проект в Android Studio с пустой активностью.

### Разработка интерфейса пользователя:
2. Добавить RecyclerView в `activity_main.xml` для отображения списка заметок.
3. Создать layout для элемента списка, включающий `TextView` для текста заметки и `TextView` для даты редактирования.
4. Добавить кнопку добавления заметок на основной экран.

### Написание логики приложения:
5. Написать класс `Note` для определения структуры данных заметки.
6. Реализовать адаптер для RecyclerView, который будет управлять списком заметок.
7. Реализовать методы для добавления, удаления и редактирования заметок.

### Работа с данными:
8. Использовать SharedPreferences для сохранения и загрузки заметок.

### Тестирование и отладка:
9. Проверить, как приложение обрабатывает добавление, удаление и редактирование заметок.
10. Убедиться, что все пользовательские вводы корректно обрабатываются.