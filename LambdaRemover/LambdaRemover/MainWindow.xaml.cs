using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace LambdaRemover
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        ObservableCollection<string> LogOutput = new ObservableCollection<string>();

        public MainWindow()
        {
            InitializeComponent();
            ListBox.ItemsSource = LogOutput;
        }

        private void RefactorButton_Click(object sender, RoutedEventArgs e)
        {
            var refactorEngine = new RefactorEngine(InputTextBox.Text, LogOutput);
            OutputTextBox.Text = "lol";
        }

        private void ListBox_SelectionChanged(SelectionChangedEventArgs e)
        {

        }

        private void ListBox_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.Key == Key.C && (Keyboard.Modifiers & ModifierKeys.Control) == ModifierKeys.Control)
            {
                Clipboard.SetText(ListBox.SelectedItem.ToString());
            }
        }

        private void InputTextBox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }
    }
}
