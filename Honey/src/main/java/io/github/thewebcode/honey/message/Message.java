package io.github.thewebcode.honey.message;

public interface Message {
    String getContent();

    Priority getPriority();

    enum Priority {
        HIGH(2),
        MEDIUM(1),
        DEFAULT(0),
        LOW(-1);

        int priority;

        Priority(int priority) {
            this.priority = priority;
        }

        public int getPriorityAsInt() {
            return priority;
        }
    }
}
