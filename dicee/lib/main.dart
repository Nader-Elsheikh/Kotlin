import 'package:flutter/material.dart';
import 'dart:math';

void main() {
  return runApp(
    MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.red,
        appBar: AppBar(
          title: Center(
            child: Text('Dicee'),
          ),
          backgroundColor: Colors.red,
        ),
        body: Dicepage(),
      ),
    ),
  );
}

class Dicepage extends StatefulWidget {
  const Dicepage({Key? key}) : super(key: key);

  @override
  State<Dicepage> createState() => _DicepageState();
}

class _DicepageState extends State<Dicepage> {
  @override
  int ld = 1;
  int rd = 1;
  void ran() {
    setState(() {
      rd = Random().nextInt(6) + 1;
      ld = Random().nextInt(6) + 1;
    });
  }

  Widget build(BuildContext context) {
    return Center(
      child: Row(
        children: [
          Expanded(
            child: TextButton(
              onPressed: () {
                ran();
              },
              child: Image.asset('images/dice$ld.png'),
            ),
          ),
          Expanded(
            child: TextButton(
              onPressed: () {
                ran();
              },
              child: Image.asset('images/dice$rd.png'),
            ),
          ),
        ],
      ),
    );
  }
}
