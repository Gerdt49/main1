package HW_38;

public enum ToDoList {
    ADD_TASK("Добавить запись"),
    VIEW_TASKS("Посмотреть все записи"),
    DELETE_TASK("Удалить запись (по номеру)"),
    EXIT("Выйти");
    private String description;  //    description -описание

    ToDoList(String description) {
        this.description = description;
    }

}
