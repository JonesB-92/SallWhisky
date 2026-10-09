# Sall Whisky Management System

Designed and developed in collaboration with  https://github.com/OlliAM and https://github.com/MassivelyOverthinking.

A Java-based desktop application designed to track and manage the manufacturing, warehousing, and inventory pipeline for a whiskey distillery. This project was built using the Model-View-Controller (MVC) architecture and features a comprehensive GUI layout along with an isolated storage layer and an automated unit testing suite.

### 🔑 Key Features

* **Distillery Tracking:** Manage malt batches, distillation processes (`BundDestillat` & `KombiDestillat`), and alcohol configurations.
* **Smart Warehousing:** Track aging barrels (`Fad`), storage units (`Lager`), shelving configurations (`Reol`), and exact spatial locations (`Plads`).
* **Inventory Management:** Monitor the transition from raw distillates to bottled components and final products (`Færdigprodukt`).
* **Modular UI Display:** Tab-based graphical user interface featuring distinct dedicated operational panes for managing Distillates, Barrels, Warehousing, and Finished Goods.
* **Robust Test Coverage:** Thoroughly validated domain model logic utilizing an extensive suite of JUnit tests.