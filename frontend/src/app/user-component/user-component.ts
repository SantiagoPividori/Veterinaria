import { Component, inject } from '@angular/core';
import { User } from '../services/user';

@Component({
  selector: 'app-user-component',
  imports: [],
  templateUrl: './user-component.html',
  styleUrl: './user-component.css',
})
export class UserComponent {

  userService = inject(User);

  users: any[] = [];

  ngOnInit(){
    this.userService.getAllUsers().subscribe({
      next: data => {
        this.users = data;
      },
      error: err => console.error(err)
    });
  }

}
