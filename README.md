# Клиентская база мобильного оператора

## Описание проекта

Этот проект представляет собой систему управления клиентской базой данных для мобильного оператора. Система позволяет хранить информацию о клиентах, тарифах и потребленном трафике. Работа с данными осуществляется через базу данных SQLite, а взаимодействие с системой — посредством JSON.

Основные возможности проекта:
- Управление тарифами: добавление новых тарифов, указание цены за 1 ГБ и их назначение клиентам.
- Учет потребленного трафика клиентами.
- Импорт данных в формате JSON.
- Экспорт данных в формате JSON.

## Основные функции

### 1. Управление тарифами
- Возможность добавлять новые тарифы с указанием цены за 1 ГБ.
- Выбор стандартных или премиальных тарифов.

### 2. Управление клиентами
- Добавление новых клиентов в базу.
- Назначение тарифа клиенту.
- Учет скидки на стоимость тарифа (в пределах от 1% до 50%).
- Регистрация и учет потребленного клиентом трафика.

### 3. Работа с данными
- Сохранение текущей базы данных в формате JSON.
- Загрузка данных из JSON-файла для обновления или восстановления базы.

## Установка и запуск

### Требования
- Python 3.7 или выше
- Установленные зависимости из файла `requirements.txt`

### Установка
1. Клонируйте репозиторий проекта:
   ```bash
   git clone <URL репозитория>
   ```
2. Перейдите в директорию проекта:
   ```bash
   cd <папка проекта>
   ```
3. Установите зависимости:
   ```bash
   pip install -r requirements.txt
   ```

### Запуск
Для запуска основного скрипта выполните команду:
```bash
python main.py
```

## Формат JSON

### Пример структуры данных для импорта/экспорта

#### Клиенты
```json
[
  {
    "name": "Иван Иванов",
    "tariff": "Стандарт",
    "discount": 0.1,
    "traffic_used": 15.0
  },
  {
    "name": "Анна Смирнова",
    "tariff": "Премиум",
    "discount": 0.2,
    "traffic_used": 25.0
  }
]
```

#### Тарифы
```json
[
  {
    "name": "Стандарт",
    "rate": 5.0
  },
  {
    "name": "Премиум",
    "rate": 3.0
  }
]
```

## Структура проекта
- `main.py` — основной файл с интерфейсом командной строки для взаимодействия с пользователем.
- `database.py` — модуль для работы с базой данных SQLite.
- `models.py` — описания классов (Клиент, Тариф, и т. д.).
- `utils.py` — вспомогательные функции для работы с JSON.

## Использование
1. Запустите программу и выберите необходимую команду из списка:
   - Добавить клиента
   - Добавить тариф
   - Учет потребленного трафика
   - Сохранение/загрузка данных из JSON
2. Следуйте подсказкам интерфейса командной строки для выполнения операций.

## Лицензия
Этот проект распространяется под лицензией MIT. Подробности смотрите в файле `LICENSE`.

