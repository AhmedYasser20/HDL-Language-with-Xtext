# HDL Language Project (Xtext + Eclipse 4.06)

This project implements a simple **Hardware Description Language (HDL)** using **Xtext** in **Eclipse 4.06**. It includes basic validation rules and error suggestions.

## Features

- **Validation**: 
  - Checks for duplicate signal declarations.
  - Ensures correct signal assignments (matching types).
  
- **Error Suggestions**: 
  - Provides helpful messages for type mismatches and suggests a compatible signal name.

## How to Use

1. **Install Eclipse with Xtext**:
   - Use **Eclipse 4.06** and install Xtext from the marketplace.

2. **Clone the Project**:
   ```bash
   git clone https://github.com/your-username/hdl-xtext-project.git
   ```

3. **Import to Eclipse**:
   - In Eclipse, go to **File** > **Import** > **Existing Projects** and select the cloned folder.

4. **Generate Artifacts**:
   - Right-click the project folder.
   - Choose **Run As** > **Generate Xtext Artifacts**.

5. **Edit HDL Files**:
   - Start creating `.hdl` files. Errors and suggestions will appear as you type.

## Main Files

- `HDL.xtext`: Defines the language.
- `HDLValidator.java`: Contains validation rules.
- `HDLQuickfixProvider.java`: Offers error suggestions.

## Contributions

Feel free to contribute by submitting pull requests or reporting issues.
