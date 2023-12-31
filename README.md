### План розробки програми для системи електронної комерції:

1. **Створення сутностей:**
   - Створити клас `Product` з атрибутами `id`, `name`, та `price`.
   - Створити клас `Cart` зі списком продуктів та методами `addProduct` та `removeProduct`.
   - Створити клас `Order` з атрибутами `orderId`, `products`, та `status`.

2. **Функціональність:**
   - Реалізувати можливість додавання та видалення продуктів з кошика.
   - Реалізувати можливість розміщення замовлення з товарів у кошику.
   - Забезпечити можливість отримання статусу конкретного замовлення.

3. **Юніт-тестування:**
   - Написати тести JUnit для перевірки додавання та видалення продуктів з кошика.
   - Написати тести JUnit для перевірки розміщення замовлення та отримання статусу замовлення.

4. **Використання Mockito:**
   - Замокати поведінку методів, наприклад, для забезпечення зміни статусу замовлення.
   - Використовувати Mockito для імітації поведінки об'єктів у тестах.

5. **Інтеграція та тестування:**
   - Забезпечити інтеграцію всіх компонентів системи.
   - Виконати комплексне тестування системи електронної комерції.

6. **Оптимізація та вдосконалення:**
   - Провести аналіз та оптимізацію коду, якщо необхідно.
   - Вдосконалити тести та забезпечити покриття коду.

### Послідовність виконаних дій:

1. **Створення сутностей:**
   - Створення класу `Product` з відповідними атрибутами та конструктором.
   - Створення класу `Cart` з методами для додавання та видалення продуктів.
   - Створення класу `Order` з відповідними атрибутами та конструктором.

2. **Реалізація функціональності:**
   - Додавання логіки для можливості розміщення замовлення та отримання статусу.
   - Перевірка правильності додавання та видалення продуктів з кошика.

3. **Написання тестів JUnit:**
   - Написання тестів для перевірки функціональності додавання та видалення продуктів.
   - Тестування розміщення замовлення та отримання статусу замовлення.

4. **Використання Mockito:**
   - Замокання методів для забезпечення потрібної поведінки в тестах.
   - Імітація в

заємодії об'єктів за допомогою Mockito.

5. **Інтеграція та тестування:**
   - Забезпечення інтеграції всіх компонентів системи.
   - Виконання комплексного тестування для перевірки працездатності всієї системи.

6. **Оптимізація та вдосконалення:**
   - Проведення аналізу та оптимізації коду.
   - Вдосконалення тестів та забезпечення високого покриття коду тестами.

Цей план може бути використаний як загальна стратегія для розробки системи електронної комерції.
