using System.Collections.ObjectModel;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;

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
            OutputTextBox.Text = RefactorEngine.RemoveLambdas(InputTextBox.Text, LogOutput);
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
